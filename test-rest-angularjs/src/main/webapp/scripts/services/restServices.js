var restServices = angular.module('restServices', ['ngResource']);

restServices.factory('TestTextResource', function($resource){
	return $resource('/WebAppArchetype1/rest/info/web', {}, {query: {method:'GET', isArray: false }});
});