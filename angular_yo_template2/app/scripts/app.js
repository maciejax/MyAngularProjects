'use strict';

/**
 * @ngdoc overview
 * @name angularYoTemplate2App
 * @description
 * # angularYoTemplate2App
 *
 * Main module of the application.
 */
angular
  .module('angularYoTemplate2App', [
    'ngCookies',
    'ngResource',
    'ngRoute'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
