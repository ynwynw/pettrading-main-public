<template>
  <div id="app">
    <div v-if="$route.path.indexOf('/backstage') == -1">
      <drawer></drawer>
      <head-tab></head-tab>
      <div class="scrool">
        <router-view v-if="isRouterAlive"></router-view>
      </div>
      <tail></tail>
      <el-backtop>
        <div class="backtop">up</div>
      </el-backtop>
    </div>
    <div v-if="$route.path.indexOf('/backstage') != -1">
      <router-view v-if="isRouterAlive"></router-view>
    </div>
  </div>
</template>

<script>
  import HeadTab from "components/common/head/HeadTab.vue"
  import Tail from "components/common/tail/Tail.vue"
  import Drawer from "components/content/drawer/Drawer.vue"

  export default {
    name: 'app',
    provide() {
      return {
        reload: this.reload
      }
    },
    data() {
      return {
        isRouterAlive: true
      }
    },
    components: {
      HeadTab,
      Tail,
      Drawer
    },
    methods: {
      reload () {
        this.isRouterAlive = false;
        this.$nextTick(function(){
          this.isRouterAlive = true
        })
      }
    },
  }
</script>

<style>
@import "assets/css/base.css";

.backtop {
  height: 100%;
  width: 100%;
  text-align: center;
  line-height: 35px;
}

.scrool {
  margin-top: 108px;
  min-height: 55em;
  /* margin-top: 64px;
  height: calc(100vh - 64px);
  overflow-y: auto; */
}
</style>