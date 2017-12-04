//criação de modulo principal
var app	=  angular.module("app",[]);

//controllers
app.controller("indexController",function(
		$scope,
		$http
){
	$scope.tarefa = {};
	$scope.titulo = "[estudo] - Atividades";
	$scope.descricao = "Encerrar Atividades";
	
	$scope.listarTarefas = function(){
		$http({method: 'GET', url:'http://localhost:8080/tasks'})
		.then(function successCallBack(response){
			console.log(response.data)
			console.log(response.status)
			$scope.tarefa = response.data;
			
		}, function errorCallBack(response){
			console.log(response.status)
		});
	};
	
	$scope.criarTarefas = function(){
		$http({method: 'POST', url:'http://localhost:8080/tasks',data:tarefa})
		.then(function successCallBack(response){
			console.log(response.data)
			console.log(response.status)
			$scope.tarefa = response.data;
			
		}, function errorCallBack(response){
			console.log(response.status)
		});
	}
	
	$scope.listarTarefas();
});