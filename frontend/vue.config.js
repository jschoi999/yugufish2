const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: [
    'vuetify'
  ],
  outputDir: '../src/main/resources/static/vue',
  // outputDir: '../src/main/resources/static',
  indexPath: '../../templates/index.html',
  // indexPath: '../templates/index.html',
  lintOnSave: false,

  devServer: {
    proxy: 'http://localhost:8081',
    allowedHosts: 'all',
  }

})
