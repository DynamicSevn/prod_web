$(document).ready(function() {
    $('.validateForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields:  {
        	name:{
        		validators:{
                    notEmpty: {
                        message: '名字不能为空'
                    }
        		}
        	},
        	code:{
        		validators:{
                    notEmpty: {
                        message: '编号不能为空'
                    }
        		}
        	},
	        price: {
                validators: {
                    digits: {

                        message: '价格必须为数字'
                    }
                }
	        	
	        }
        
        }
    });
});