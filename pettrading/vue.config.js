module.exports = {
  // publicPath: process.env.NODE_ENV === 'production' ? './' : './',
  // outputDir: 'dist',
  // assetsDir: 'static',
  configureWebpack: {
    resolve: {
      alias: {
        'components': '@/components',
        'common': '@/common',
        'assets': '@/assets',
        'network': '@/network',
        'store': '@/store',
        'views': '@/views',
      }
    }
  },
  devServer: {
    port: 8080,
    proxy: {
      '/api': {
        target: 'http://localhost:8081',  // target host
        ws: true,  // proxy websockets(是否代理websockets)
        changeOrigin: true,  // needed for virtual hosted sites(设置同源  默认false，是否需要改变原始主机头为目标URL)
        pathRewrite: {
          '^/api': ''  // rewrite path
        }
      },
    }
  }
}