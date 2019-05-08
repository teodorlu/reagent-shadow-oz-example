# A pretty basic example of reagent + Oz

Oz + Reagent + shadow-cljs simplest example

Relevant changes to get Oz working with shadow-cljs are:

1. [Vega required cljsjs shim files](https://github.com/ivanminutillo/reagent-shadow-oz-example/tree/master/src/cljsjs)
2. [es6 compiler options on shadow-cljs.edn](https://github.com/ivanminutillo/reagent-shadow-oz-example/blob/master/shadow-cljs.edn#L14)
3. [Vega dependencies on package.json](https://github.com/ivanminutillo/reagent-shadow-oz-example/blob/master/package.json#L25)

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
