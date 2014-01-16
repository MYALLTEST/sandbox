Ext.define('WA.controller.Items', {
	extend: 'Ext.app.Controller',

	views: [ 'GridItems'],
	stores: [ 'Items'],
	models: [ 'Item'],
	init: function() {
		this.control({
			'griditems': {
				activate: this.onActivate, //1st time and  tab selection
				afterrender: this.onAfterRender
			}
		});
	},
	onActivate: function(cmp, options) {
	},
	onAfterRender: function(cmp, options) {
	    var fd = cmp.down('griditems');
	},
});