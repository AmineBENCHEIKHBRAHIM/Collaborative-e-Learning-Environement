/**
 * AJAX pour l'affichage des réponses à un message
 * @param divDest : bloc de destination
 * @param idParent : message parent
 * @return
 */
	function messages(operation, idParent)
	{	
			
			if(operation == "afficherReponses")
			{
				divDest = "ListRepMP"+idParent;
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			
				
			}
			else if(operation == "repondreMessage")
			{
				divDest = "RepdivMP"+idParent;
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			}
			else if(operation == "ajouterMessage")
			{
				divDest = "divNouvMess";
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			}
			else if(operation == "supprimerMessage")
			{
				divDest = "divMP"+idParent;
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			}
			else if(operation == "modifierReponseMessage")
			{
				divDest = "divMF"+idParent;
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			}
			else if(operation == "supprimerReponseMessage")
			{
				divDest = "divMF"+idParent;
				$("#"+divDest).empty();
				options = 'operation='+operation+'&idParent='+idParent;
			}
			// Chargement des faqs pour la catégorie
			var bodyContent = '';
			$.ajax({
				   type: "POST",
				   url: "topic.jsp",
				   data: options,
				   success: function(text){
						bodyContent = text;
						afficher(divDest,bodyContent);
					}
				 });
	
	}

	/**
	 * Fonction de gestion des topics
	 * @param operation
	 * @param idTopic
	 * @return
	 */
	function topics(operation, idTopic)
	{	
		if(operation == "ajouterTopic")
		{
			divDest = "divAjoutTopic";
			$("#"+divDest).empty();
			options = 'operation='+operation+'&idTopic='+idTopic;
		
			
		}
		else if(operation == "supprimerTopic")
		{
			divDest = "ligneTopic"+idTopic;
			$("#"+divDest).empty();
			options = 'operation='+operation+'&idTopic='+idTopic;
		}
		
		// Chargement des faqs pour la catégorie
		var bodyContent = '';
		$.ajax({
			   type: "POST",
			   url: "forum_accueil.jsp",
			   data: options,
			   success: function(text){
					bodyContent = text;
					afficher(divDest,bodyContent);
				}
			 });
	}
	
	/**
	 * Affichage des resultats AJAX (fction ci-dessus)
	 * @param divDest
	 * @param data
	 * @return
	 */
	function afficher(divDest, data) {
	
		$("#"+divDest).slideUp(200, function() {  
				$("#"+divDest).empty();
				$("#"+divDest).append(data);
				$("#"+divDest).slideDown(500);	
		});
	}
	
	