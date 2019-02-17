#+html: <p align="center"><img src=".github/logo.png" width="460" /></p>
#+html: <p align="center"><strong>Security Analyst Dashboard.</strong> A dashboard for cyber-physical system design and analysis.</p>

# Security Analyst Dashboard

## About the paper
   - Title: Looking for a Black Cat in a Dark Room: Security Visualization for Cyber-Physical System Design and Analysis
   - Authors: Georgios Bakirtzis, Brandon J. Simon, Cody H. Fleming, Carl R. Elks

## Getting Started
	This project works in conjunction with [[https://github.com/bakirtzisg/cybok-cli][cybok-cli]] & [[https://github.com/bakirtzisg/graphml_export][graphml_export]].
	Security Analyst Dashboard acts as a user interface to use [[https://github.com/bakirtzisg/cybok-cli][cybok-cli]] to find

## Prerequisites
	Please look at the prequisites found in [[https://github.com/bakirtzisg/cybok-cli][cybok-cli]]

	- Java JDK 8
	- Python 3.6.x

## Building and Running
	The following script will automatically initialize the cybok-cli submodule, compile the code, and run the code.

    Windows:
    ```bash
  	#+BEGIN_SRC bash
  	$./build_and_run.bat
  	#+END_SRC
    ```

    GNU/Linux
	#+BEGIN_SRC bash
	$./build_and_run.sh
	#+END_SRC


## Usage

	The dashboard will run checking to make sure you have the correct Python version and that Cybok is installed correctly. It will close if either had an issue.
	On the first launch, you will be asked if you would like to update the cybok databases which is required for proper operation. This will take some time to complete.

### Features

#### GraphML Support

	The System Topology and specifications files use GraphML files.

	For the System Topology file, the required attributs to be included are.. "Entry Points", "Software", "Firmware", "Operating System", and "Device".

#### Topology GraphML Attribute Requirements

  | Attribute         | Description                                     |
	| ----------------- | ----------------------------------------------- |
	| Entry Points		  | How external devices interacts with the system	|
	| Software		  	  | What Software the node uses						          |
	| Firmware			    | What Firmware the node uses						          |
	| Operating System	| What Operating System the node uses				      |
	| Device			      | The device name that the node is 					      |

#### Specifications GraphML Attribute Requirements

  | Attribute | Description |
  | --- | --- |
  | Type | Type of requirement; Structure, Mission, or Function |
  | Description | Description of the requirement |



###	Toolbar Options:

  | Attribute         | Description                                                                                   |
	| ----------------- | --------------------------------------------------------------------------------------------- |
	| `Load Topology` 	| File loading dialog to select the topology and (optionally) the system specification file.	  |
	| `Attack Surfaces` | Toggles the visibility of attack surfaces on the topology graph.								              |
	| `Analysis` 		    | Performs the Attack Vector analysis on the topology graph using Cybok.						            |
	| `Show Deleted` 	  | Toggles the visibility of deleted attack vectors in the attack vector space and tree views.	  |
	| `Show Hidden` 	  | Toggles the visibility of hidden attack vectors in the attack vector space and tree views.	  |
	| `Show CVE` 		    | Toggles the visibility of CVE attack vectors in the attack vector space and tree views.		    |
	| `Add to Bucket` 	| Adds all the selected attack vectors to the bucket.											                      |
	| `Delete Attacks` 	| Deletes all the selected attack vectors.														                          |


### Key bindings

  | Command  | Description                                                                            |
	| -------- | -------------------------------------------------------------------------------------- |
	| `CTRL+S` | save node positions of the selected graph to a file                                  	|
	| `CTRL+L` | load node positions of the selected graph from file                                  	|
	| `CTRL+E` | exports the selected graph as a .graphml file                                        	|
	| `CTRL+F` | freeze/unfreeze auto layout                                                          	|
	| `CTRL+G` | (attack vector space)  grows the current selection (selects the nodes related to it) 	|
	| `CTRL+B` | (attack vector space) adds the selected nodes to the bucket                      		  |
	| `CTRL+I` | (attack vector space) opens a panel with additional information of the selected node 	|
	| `CTRL+A` | (bucket) selects all visible nodes                                                   	|
	| `DEL`    | deselects the current selection                                                      	|
	| `DEL`    | (bucket) removes all checked entries from the bucket                                 	|
