var restServices = angular.module('restServices', ['ngResource']);

restServices.factory('TestTextResource', function($resource){
	return $resource('/WebAppExample2/rest/firstservice', {});
});