## Kubernetes is a powerful container orchestration platform that automates the deployment, scaling, and management of containerized applications.

#### 1. What is Kubernetes?

##### At its core, Kubernetes is a container orchestration platform. Containers are lightweight, portable, and consistent environments for running applications. Kubernetes helps you manage these containers at scale.

#### 2. Basic Concepts - 

##### Pods: The smallest deployable unit in Kubernetes. A pod can contain one or more containers.
##### Nodes: These are the machines where your containers (pods) run.
##### Cluster: A cluster is a collection of nodes managed by Kubernetes.
##### Control Plane: The brain of the Kubernetes cluster. It manages the state of the cluster.
##### Kubectl: A command-line tool to interact with your Kubernetes cluster.

#### 3. Deployment of Applications -

##### Kubernetes manages applications through Deployments. Here's how you'd create a simple deployment:
###### apiVersion: apps/v1
###### kind: Deployment
###### metadata:
######   name: my-app
###### spec:
######   replicas: 3
######   selector:
######     matchLabels:
######       app: my-app
######   template:
######     metadata:
######       labels:
######         app: my-app
######     spec:
######       containers:
######       - name: my-app-container
######         image: my-app-image:latest

##### replicas specify how many instances (pods) of your application should run.
##### selector and template are used to label and define the pod template.

