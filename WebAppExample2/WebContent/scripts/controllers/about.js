'use strict';

/**
 * @ngdoc function
 * @name angularYoTemplate2App.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the angularYoTemplate2App
 */
projControllers.controller('AboutCtrl',['$scope']);

function AboutCtrl ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  };
