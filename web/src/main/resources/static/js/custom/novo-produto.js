$(document).ready(function(){
	  
	$('#summernote').summernote();
	  
    $.extend($.validator.messages, {
      required: "Campo obrigatório.",
      remote: "Please fix this field.",
      email: "E-mail inválido",
      url: "URL inválida.",
      date: "Data inválida.",
      number: "Valor inválido.",
      equalTo: "Please enter the same value again.",
      accept: "Please enter a value with a valid extension.",
      maxlength: $.validator.format("Please enter no more than {0} characters."),
      minlength: $.validator.format("Please enter at least {0} characters."),
      rangelength: $.validator.format("Please enter a value between {0} and {1} characters long."),
      range: $.validator.format("Please enter a value between {0} and {1}."),
      max: $.validator.format("Please enter a value less than or equal to {0}."),
      min: $.validator.format("Please enter a value greater than or equal to {0}.")
    });
    
    $("#form").steps({
      bodyTag: "fieldset",
      labels: {
        current: "passo atual:",
        pagination: "Paginação",
        finish: "Enviar",
        next: "Próximo",
        previous: "Anterior",
        loading: "Carregando ..."
      },
      onStepChanging: function (event, currentIndex, newIndex)
      {
        // Always allow going backward even if the current step contains invalid fields!
        if (currentIndex > newIndex)
        {
          return true;
        }
        
        var form = $(this);
        
        // Clean up if user went backward before
        if (currentIndex < newIndex)
        {
          // To remove error styles
          $(".body:eq(" + newIndex + ") label.error", form).remove();
          $(".body:eq(" + newIndex + ") .error", form).removeClass("error");
        }
        
        // Disable validation on fields that are disabled or hidden.
        form.validate().settings.ignore = ":disabled,:hidden";
        
        // Start validation; Prevent going forward if false
        return form.valid();
      },
      onFinishing: function (event, currentIndex)
      {
        var form = $(this);
        
        // Disable validation on fields that are disabled.
        // At this point it's recommended to do an overall check (mean ignoring only disabled fields)
        form.validate().settings.ignore = ":disabled";
        
        // Start validation; Prevent form submission if false
        return form.valid();
      },
      onFinished: function (event, currentIndex)
      {
        var form = $(this);
        
        // Submit form input
        form.submit();
      }
    }).validate({
      errorPlacement: function (error, element)
      {
    	  if(element.attr('name') === 'teste') {
    		  error.insertAfter($('label#labelTeste'));
   		  } else {
   			element.before(error);
   		  }
      }
    });
  });