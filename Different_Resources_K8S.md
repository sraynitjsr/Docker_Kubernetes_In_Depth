# Different Types of K8S Resources of Different Kind

## 1. Pods (kind: Pod): Pods are the smallest deployable units in Kubernetes.They can contain one or more containers and share network and storage resources. Pods are used to run a single instance of a process in Kubernetes.

## 2. ReplicationController (kind: ReplicationController): ReplicationControllers ensure that a specified number of pod replicas are running at all times. If pods fail or are deleted, the ReplicationController creates new replicas to maintain the desired state.

## 3. ReplicaSet (kind: ReplicaSet): A ReplicaSet is an updated version of the ReplicationController. It is used to maintain a set number of pod replicas with more advanced selectors.

## 4. Deployments (kind: Deployment): Deployments provide declarative updates to applications. They manage ReplicaSets and allow us to perform rolling updates, rollbacks, and scaling of applications.

## 5. StatefulSets (kind: StatefulSet): StatefulSets are used for stateful applications that require stable network identifiers and ordered, graceful deployment and scaling.

