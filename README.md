# Kubernetes Resource Types

## Core Resource Types

### Pods
The smallest deployable units in Kubernetes, encapsulating one or more containers, storage resources, and a unique network IP.

### Deployments
Manages a set of identical Pods, providing declarative updates, rollouts, and rollbacks.

### Services
Abstracts a set of Pods and enables network access using labels and selectors.

### Volumes
Persistent storage for containers, supporting various types like emptyDir, hostPath, and persistentVolumeClaim.

### ConfigMaps and Secrets
ConfigMaps decouple configuration artifacts from container images, while Secrets store sensitive data securely.

### StatefulSets
Manages stateful applications with guarantees on deployment and scaling operations.

### DaemonSets
Ensures that all (or some) Nodes run a copy of a Pod, typically used for system daemons.

### Jobs and CronJobs
Jobs create Pods that run to completion, while CronJobs schedule Jobs at specified intervals.

### Namespaces
Virtual clusters within a Kubernetes cluster, providing isolation and resource allocation.

## Additional Resource Types

### PersistentVolumes (PVs) and PersistentVolumeClaims (PVCs)
PVs are storage resources with a lifecycle independent of Pods, while PVCs request storage by users.

### ServiceAccounts
Provides identities for Pods to interact with Kubernetes API securely.

### Roles, RoleBindings, ClusterRoles, and ClusterRoleBindings
Define permissions within namespaces or cluster-wide and bind them to users or groups.

### CustomResourceDefinitions (CRDs)
Extends Kubernetes API to create new resource kinds for complex applications.

### Endpoints
Groups of IP addresses and ports exposed by Services for other applications to use.

### PodDisruptionBudgets (PDBs)
Limits simultaneous disruptions of Pods during maintenance or upgrades.

### ResourceQuotas
Limits aggregate resource consumption (CPU, memory, etc.) in a namespace.

### Horizontal Pod Autoscaler (HPA)
Scales Pods based on CPU, memory utilization, or custom metrics.

### Pod Security Policies
Controls security-sensitive aspects of Pod specifications.

### MutatingWebhookConfiguration and ValidatingWebhookConfiguration
Configures webhooks for operations before or after Kubernetes object changes.

### StorageClasses
Defines different classes of storage in a Kubernetes cluster for dynamic provisioning.

### LimitRanges
Sets default and minimum/maximum resource limits for Pods in a namespace.

### Pod Presets (Deprecated)
Previously used to inject additional configurations into Pods, now deprecated.

### Endpointslices
Decomposes Kubernetes Services into smaller pieces for efficiency.
