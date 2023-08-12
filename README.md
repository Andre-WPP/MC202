# MC322 - LABs
This repository is intended to help OO Labs' management,

# LIBRARY MANAGEMENT SYSTEM

One Paragraph of project description goes here

# Table of Contents  
   * [1 - How to setup Git](#1---how-to-setup-git)
      * [1.1 - How to start?](#11---how-to-start)
      * [1.2 - How to work with git?](#12---how-to-work-with-git)
      * [1.3 - Special cases: multiple branches.](#13---special-cases-multiple-branches)
    
   * [2 - How to code in Java](#2---how-to-code-in-java)
   * [3 - Project](#3---project)
      * [3.1 - Class model:](#31---class-model)
      * [3.2 - Class Implementation:](#32---class-implementation)


## 1 - How to setup Git
*Nice readme file cheatsheet:* <https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet>

The discipline decided to use GitHub as the main repository to manage lab's deliveries. Therefore, below you will find the basic git code to proceed with activities.

### 1.1 - How to start?

First, you need to create a git repository (this can be done either via github website or via command line with the following code:

```
git init
```

If you already have a git repository, you can clone it locally using the following command:

```
git clone https://github.com/Andre-WPP/MC202.git
```

Now, we have an active repository to work with.



### 1.2 - How to work with git?

Once you are logged into a repository, you can create branches

```
git branch <name>
```
then, you can select the branch to start working in it. The default branch is called 'main':

```
git checkout <name>
``` 

once you've made some change in your code, you can commit these changes locally. First you should select the specific files you want to commit using

```
git add <name>  or git add.
```
then, you may commit them using:

```
git commit -m 'A description of what has been changed'
```

Last, but not least, you can send the local updates to github server so all team members can collaborate, using:

```
git push
``` 

### 1.3 - Special cases: multiple branches.

## 2 - How to code in Java

In java, you should create a folder structure like that:

```
project-folder
|_src
  |_package1
    |_class11.java
    |_class12.java
  |_package2
    |_class21.java
    |_class22.java
  |_main.java
|_lib

```

A class must have 4 elements:
  [**1-Attributes:** variables that defines the state of an object]
  [**2-Constructor:** special method to instatiate objects and create their first state]
  [**3-Getters/Setters:** special methods to set/reset an object's attribute or use their values in the scope of the object's instantiation]
  [**4-Methods:** whatever functionality you want to give to your class]

## 3 - Project

### 3.1 - Class model:
![image](https://github.com/Andre-WPP/MC322/assets/141690925/ccae4914-66f7-494a-8d82-82210164e1a8)


### 3.2 - Class Implementation:


## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds


## Authors

* **André Pereira** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.


## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
