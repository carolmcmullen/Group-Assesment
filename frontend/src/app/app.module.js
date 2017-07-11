import ngUirouter from 'angular-ui-router'
import localStorage from 'angular-local-storage'
// import ngMaterial from 'angular-material'
// import ngAria from 'angular-aria'
// import ngAnimate from 'angular-animate'

import { ftApp } from 'app/component/app.component'
import { ftHeader } from 'app/component/header.component'
import { ftGame } from 'app/component/body.component'
import { ftLogin } from 'app/component/login.component'
import { ftSettings } from 'app/component/settings.component'
import { ftRegister } from 'app/component/register.component'
import { ftHome } from 'app/component/home.component'

import { AppService } from 'app/app.service'
import { run } from 'app/app.run'
import { ftGameSettings } from 'app/constants'

import { config } from 'app/config/app.config'
import { loginConfig } from 'app/config/login.config'
import { gameConfig } from 'app/config/game.config'
import { settingsConfig } from 'app/config/settings.config'
import { registerConfig } from 'app/config/register.config'
import { homeConfig } from 'app/config/home.config'

export default ng
  .module('ft.buttons', [localStorage,
    ngUirouter,
    loginConfig,
    gameConfig,
    registerConfig,
    settingsConfig,
    // ngMaterial,
    // ngAria,
    // ngAnimate,
    homeConfig
  ])
  .service('appService', AppService)
  .component('ftApp', ftApp)
  .component('ftHeader', ftHeader)
  .component('ftGame', ftGame)
  .component('ftLogin', ftLogin)
  .component('ftSettings', ftSettings)
  .component('ftRegister', ftRegister)
  .component('ftHome', ftHome)
  .constant('ftGameSettings', ftGameSettings)
  .config(config)
  .run(run)
  .name
