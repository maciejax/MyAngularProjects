module.exports = function (grunt){

	grunt.loadNpmTasks('grunt-wiredep');

	grunt.initConfig({

	wiredep: {
 	  	    // Point to the files that should be updated when 
		    // you run `grunt bower-install` 
		app {
		    src: 'app/index.html'  // .html support...  
		}
	}
	
	});
};