// Main AngularJS Web Application
var app = angular.module('tutorialWebApp', ['ngRoute']);

// Configure the routes
app.config(['$routeProvider',function($routeProvider) {
	$routeProvider
	//Home
	.when("/",{templateUrl: "partials/home.html", controller: "PageCtrl"})
	//Pages
	.when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"})
	.otherwise("/404", {templateUrl: "partials/404.html", controller: "PageCtrl"});
}]);

app.controller('PageCtrl',[ '$scope', '$q', function($scope,$q){
	console.log("Page Controller reporting for duty.");

	$('.carousel').carousel({
    	interval: 5000
  	});

  	$('.tooltip-social').tooltip({
    	selector: "a[data-toggle=tooltip]"
  	});

}]);