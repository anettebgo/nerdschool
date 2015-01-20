(function(){

	assert('should return true when text is matching case and content', function(){
		expect('somephrase').toEqual('somephrase');
	});

	assert('should return false when text is not matching case, but is matching content', function(){
		expect('SOMEPHRASE').not().toEqual('somephrase');
	});

	assert('should return false when text has invariant case, but has matching content', function(){
		expect('SomEPhrAsE').not().toEqual('somephrase');
	});

	assert('0 is equal to 0', function(){
		expect(0).toEqual(0);
	});

	assert('integer 0 is not equal to string 0', function(){
		expect('0').not().toEqual(0);
	});

	assert('boolean true is not equal to string true', function(){
		expect(true).not().toEqual('true');
	});

	assert('should fail', function(){
		expect(true).toEqual(false);
	});

}());