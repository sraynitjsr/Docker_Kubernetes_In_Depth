## In Kubernetes (k8s), a ClusterRole is a way to define a set of permissions for accessing and interacting with resources across the entire cluster.
## It is a cluster-level resource, meaning that it applies globally to all namespaces within the cluster.

## A ClusterRole is a collection of rules that specify what actions (verbs) are allowed or denied on which resources.
## These resources include objects like pods, services, deployments, and more. Each rule in a ClusterRole defines a set of permissions for a specific API group, resource, and namespace.

## Sample yaml for clusterrole manifest :
#### apiVersion: rbac.authorization.k8s.io/v1
#### kind: ClusterRole
#### metadata:
####   name: sraynitjsr-cluster-role
#### rules:
#### - apiGroups: [""]
####   resources: ["pods"]
####   verbs: ["get", "list", "watch"]
#### - apiGroups: ["apps"]
####   resources: ["deployments"]
####   verbs: ["get", "list", "watch", "create", "update", "delete"]

## In this example, the ClusterRole named "example-cluster-role" has two rules.

## The first rule allows "get," "list," and "watch" operations on pods in any namespace.

## The second rule allows a broader set of operations ("get," "list," "watch," "create," "update," "delete") on deployments in the "apps" API group.

## After defining a ClusterRole, we need to bind it to one or more subjects using a ClusterRoleBinding or a RoleBinding. Subjects can be users, groups, or service accounts. This binding associates the permissions defined in the ClusterRole with the subjects, granting them the specified access across the cluster.

## It's important to note that ClusterRoles are typically used for cluster-wide permissions, while Roles are used for namespace-specific permissions. ClusterRoles and Roles, together with RoleBindings and ClusterRoleBindings, form the role-based access control (RBAC) system in Kubernetes, allowing administrators to control and limit access to resources based on roles and permissions.
