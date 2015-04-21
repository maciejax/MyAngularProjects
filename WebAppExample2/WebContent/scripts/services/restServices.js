var restServices = angular.module('restServices', ['ngResource']);

restServices.factory('PersonResource', [ '$resource', 
    function($resource){
	return $resource
	(
				'/WebAppExample2/rest/person', 
				{}, 
				{query : {method: 'GET', 
						  isArray:true,
						  interceptor: {
			                response: function (resp) {
			                    console.log('response in interceptor', resp);
			                    return resp;
			                },
			                responseError: function (resp) {
			                    console.log('error in interceptor', resp);
			                    return resp;
			                }
						  }
				}}
	);
}]);