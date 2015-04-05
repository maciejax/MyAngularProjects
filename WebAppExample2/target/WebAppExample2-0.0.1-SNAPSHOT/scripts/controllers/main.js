'use strict';

/**
 * @ngdoc function
 * @name angularYoTemplate2App.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularYoTemplate2App
 */
angular.module('angularYoTemplate2App')
  .controller('MainCtrl', function ($scope, TestTextResource) {
    
	$scope.data = {};  
	$scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    TestTextResource.get(function(response) {
    	$scope.data.restMessage = response;
	});
     
  });
