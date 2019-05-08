# A basic example of reagent + shadow-cljs + Oz setup

Following [this issue](https://github.com/metasoarous/oz/issues/64), the relevant changes to get Oz working with shadow-cljs are:

1. [Create a cljsjs folder with the required vega shim files](https://github.com/ivanminutillo/reagent-shadow-oz-example/tree/master/src/cljsjs)
2. [Add es6 compiler options on shadow-cljs.edn](https://github.com/ivanminutillo/reagent-shadow-oz-example/blob/master/shadow-cljs.edn#L14)
3. [Install Vega dependencies on package.json](https://github.com/ivanminutillo/reagent-shadow-oz-example/blob/master/package.json#L25)

## Usage
Clone the demo

```
git clone https://github.com/ivanminutillo/reagent-shadow-oz-example.git
```

Enter the project and install the needed dependencies

```
cd reagent-shadow-oz-example && npm install
```

Start the app

```
shadow-cljs watch app

```
Visit http://localhost:3000
