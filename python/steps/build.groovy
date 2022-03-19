void call(){
	stage("Building Python app"){
  	   node('built-in'){
             sh(script:"ls -ltr")
             echo "Hello from build.groovy"
	   }
     }


}
