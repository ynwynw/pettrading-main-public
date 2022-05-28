import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Carousel,CarouselItem,Pagination,Button,Message,Drawer,Backtop,Tooltip,Form,FormItem,Radio,RadioGroup,Input,Select,Option,Upload,Slider,InputNumber,Dialog,Steps,Step,Menu,Submenu,MenuItem,MenuItemGroup,Collapse,CollapseItem,MessageBox,Notification,Table,TableColumn,Popconfirm,Popover,Badge,DatePicker,Divider } from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(Carousel);
Vue.use(CarouselItem);
Vue.use(Pagination);
Vue.use(Button);
Vue.use(Drawer);
Vue.use(Backtop);
Vue.use(Tooltip);
Vue.use(Form);
Vue.use(FormItem);
Vue.use(Radio);
Vue.use(RadioGroup);
Vue.use(Input);
Vue.use(Select);
Vue.use(Option);
Vue.use(Upload);
Vue.use(Slider);
Vue.use(InputNumber);
Vue.use(Dialog);
Vue.use(Steps);
Vue.use(Step);
Vue.use(Menu);
Vue.use(Submenu);
Vue.use(MenuItem);
Vue.use(MenuItemGroup);
Vue.use(Collapse);
Vue.use(CollapseItem);
Vue.use(Table);
Vue.use(TableColumn);
Vue.use(Popconfirm);
Vue.use(Popover);
Vue.use(Badge);
Vue.use(DatePicker);
Vue.use(Divider);

Vue.prototype.$message = Message;
Vue.prototype.$msgbox = MessageBox;
Vue.prototype.$alert = MessageBox.alert;
Vue.prototype.$confirm = MessageBox.confirm;
Vue.prototype.$prompt = MessageBox.prompt;
Vue.prototype.$notify = Notification;

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
