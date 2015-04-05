'use strict';

/**
 * @ngdoc function
 * @name angularYoTemplate2App.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the angularYoTemplate2App
 */
angular.module('angularYoTemplate2App')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
