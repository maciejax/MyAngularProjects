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
    
	$scope.messagesList = [];
	$scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

	TestTextResource.query().$promise.then(function(data) {
		$scope.messagesList = [].concat(data.Message);
	});
	
  });
