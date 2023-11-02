# Different Types of K8S Resources of Different Kind

## 1. Pods (kind: Pod): Pods are the smallest deployable units in Kubernetes.They can contain one or more containers and share network and storage resources. Pods are used to run a single instance of a process in Kubernetes.

## 2. ReplicationController (kind: ReplicationController): ReplicationControllers ensure that a specified number of pod replicas are running at all times. If pods fail or are deleted, the ReplicationController creates new replicas to maintain the desired state.

## 3. ReplicaSet (kind: ReplicaSet): A ReplicaSet is an updated version of the ReplicationController. It is used to maintain a set number of pod replicas with more advanced selectors.

## 4. Deployments (kind: Deployment): Deployments provide declarative updates to applications. They manage ReplicaSets and allow us to perform rolling updates, rollbacks, and scaling of applications.

## 5. StatefulSets (kind: StatefulSet): StatefulSets are used for stateful applications that require stable network identifiers and ordered, graceful deployment and scaling.

## 6. DaemonSet (kind: DaemonSet): DaemonSets ensure that a copy of a pod runs on all nodes in the cluster, typically for tasks like logging or monitoring.

## 7. Services (kind: Service): Services define a logical set of pods and a policy by which to access them. They provide network access to a set of pods and can be used for load balancing and service discovery.

## 8. ConfigMap (kind: ConfigMap) and Secret (kind: Secret): ConfigMaps store configuration data, while Secrets store sensitive information. They can be mounted as volumes or exposed as environment variables in pods.

## 9. Ingress (kind: Ingress): Ingress resources provide external access to services within a cluster. They define the rules for routing HTTP and HTTPS traffic to different services based on hostnames and paths.

## 10. PersistentVolume (kind: PersistentVolume) and PersistentVolumeClaim (kind: PersistentVolumeClaim): These resources are used to manage storage in a Kubernetes cluster. PersistentVolumes represent physical storage resources, while PersistentVolumeClaims are used by pods to request storage.

## 11. Namespace (kind: Namespace): Namespaces provide a way to group and isolate resources in a Kubernetes cluster. They can be used for resource organization and access control.

## 12. ServiceAccount (kind: ServiceAccount): Service accounts are used to give pods access to API resources, and they can be associated with specific permissions.

## 13. CustomResourceDefinition (kind: CustomResourceDefinition): CustomResourceDefinitions enable the extension of the Kubernetes API with custom resources. These are often used to define resources for specific applications or controllers.

## 14. Job (kind: Job): A Job in Kubernetes is used to run a single task or a set of tasks to completion. Once the tasks are completed, the Job is considered finished. Jobs are typically used for tasks that are run once, such as batch processing, data migration, or backups. We can specify the number of completions and parallelism for the tasks in a Job.

## 15. CronJob (kind: CronJob): A CronJob is an extension of the Job resource that allows us to schedule tasks to run at specified times using a cron-like schedule. CronJobs are useful for running recurring tasks, such as periodic data processing, backups, or any operation that needs to occur on a regular schedule. Kubernetes handles the scheduling and execution of these tasks based on the defined schedule.

## These are some of the core resource types in Kubernetes. Kubernetes also supports many other resource types and extensions that allows us to customize and manage applications and infrastructure efficiently.
