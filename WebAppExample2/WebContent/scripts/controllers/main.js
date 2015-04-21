/**
 * @ngdoc function
 * @name angularYoTemplate2App.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularYoTemplate2App
 */

projControllers.controller('MainCtrl',['$scope','PersonResource', MainCtrl]);

function MainCtrl ($scope, PersonResource) {
    
	$scope.personsList = [];

	$scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    PersonResource.query(function(response) {
    	
    	_.forEach(response, function(p){
    		$scope.personsList.push(p.person);
    	});

    });
     
  };
