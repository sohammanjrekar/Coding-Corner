**Node.js TypeScript: How to Automate the Development Workflow**
**Create the project structure**
1) First, create a new directory called nodets.
2) Second, create two sub-directories under the nodets called build and src, like this:
* You’ll store the TypeScript code in the src directory.

* Once the TypeScript compiler compiles the source TypeScript files, it will store the output files in the build directory.

**Configure the TypeScript compiler**
* From the Terminal on macOS and Linux or Command Prompt on Windows, run the following command in the nodets directory to create the tsconfig.json file:
```
tsc --init
```
You’ll see the tsconfig.json created under the nodets directory:
* The tsconfig.json file indicates that the directory (nodets) is the root of the TypeScript project.

* When you compile the TypeScript files, the TypeScript compiler will use the options in the tsconfig.json to compile the project.

* Now, you can open the tsconfig.json file. There are many options. In this tutorial, you’ll focus on these two options:

1) rootdir – specifies the root directory of the TypeScript input files.
2) outdir -stores the JavaScript output files.
* These options are commented by default. And you’ll need to uncomment ( remove the // at the beginning of the line) and change them as follows:

a) For the outDir option:
"outDir": "./build"
Code language: JavaScript (javascript)
b) For the rootDir option:
"rootDir": "./src"
Code language: JavaScript (javascript)
To verify the new configuration, you can create a new file called app.ts under the ./src directory and place the following code:

* And then run the following command to execute the TypeScript compiler. It’ll compile all the files stored in the src directory:tsc
* If the configuration is correct, you’ll see the app.js generated under the ./build directory:


* To run the app.js, you navigate to the build directory and execute the following command:

node app.js
Code language: CSS (css)
You’ll see the following output:

Node.js TypeScript
Code language: CSS (css)
Every time when you change the TypeScript code, you need to:

Build the project.
Run the JavaScript output files.
This is time-consuming.

Luckily, you can automate the whole process using some Node.js modules.

Install Node.js modules
The nodemon module allows you to automatically restart the application when you change the JavaScript source code.

The concurrently module runs multiple commands concurrently.

First, execute the npm init command from the root directory of the project:

npm init --yes
Next, install the nodemon and concurrently module:

npm install --g nodemon concurrently
It’ll take some time to install. Once the installation completes.

Note that the -g flag will instruct npm to install these two modules globally. This allows you to use them in other projects.

Then, open the package.json file, and you’ll something like this in the scripts option:

...  
"scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
},
...
Code language: JavaScript (javascript)
After that, change the scripts option to the following:

...
"scripts": {
    "start:build": "tsc -w",
    "start:run": "nodemon build/app.js",
    "start": "concurrently npm:start:*"
},
...
Code language: JavaScript (javascript)
This "start:build": "tsc -w" will watch for changes in the ./src directory and compile them automatically.

This "start:run": "nodemon build/app.js" will automatically run the app.js in the ./build directory whenever the new file is generated.

This "start": "concurrently npm:start:*" runs all the commands that start with npm:start:*, which executes both start:build and start:run commands above.

Since the app.js will be the entry point for the Node.js program, you also need to change the following option in the package.json file to app.js:

From:

"main": "index.js"
Code language: JavaScript (javascript)
To:

 "main": "app.js"
Code language: JavaScript (javascript)
Finally, execute the following command:

npm start
To verify the configuration, you change some code in the app.ts. And you’ll see the output in the console.