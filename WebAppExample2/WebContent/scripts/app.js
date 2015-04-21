
/**
 * @ngdoc overview
 * @name angularYoTemplate2App
 * @description
 * # angularYoTemplate2App
 *
 * Main module of the application.
 */

var angularYoTemplate2App = angular.module('angularYoTemplate2App', [
    'ngCookies',
    'restServices',
    'projControllers',
    'ngRoute'
  ]);

var projControllers = angular.module('projControllers', []);

angularYoTemplate2App.config([ '$routeProvider', function ($routeProvider) {
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
}]);
