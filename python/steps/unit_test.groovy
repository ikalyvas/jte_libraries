void call(){
	stage("Unit tests"){
 	    node('built-in'){
		echo "Hello from unit_test.groovy"
             }
	}
}
