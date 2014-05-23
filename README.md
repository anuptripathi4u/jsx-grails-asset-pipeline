JSX Grails
=====================
A Grails plugin that provides support for compiling [JSX](http://facebook.github.io/react/) for the asset-pipeline static asset management plugin.

For more information on how to use asset-pipeline, visit [here](http://www.github.com/bertramdev/asset-pipeline).


Usage
-----

Simply create files in your standard `assets/javascripts` folder with extension `.jsx` or `.js.jsx`. You also may require other files by using the following requires syntax at the top of each file:

```javascript
// require test
// require_self
// require_tree .
```