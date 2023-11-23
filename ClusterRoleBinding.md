## A ClusterRoleBinding is an object that binds a set of permissions defined in a ClusterRole to a set of subjects.
## This binding grants the specified permissions to the subjects within the entire cluster.

#### Sample ClusterRoleBinding yaml File
###### apiVersion: rbac.authorization.k8s.io/v1
###### kind: ClusterRoleBinding
###### metadata:
######   name: my-clusterrole-binding
###### subjects:
###### - kind: User
######   name: alice
######   apiGroup: rbac.authorization.k8s.io
###### roleRef:
######   kind: ClusterRole
######   name: my-clusterrole
######   apiGroup: rbac.authorization.k8s.io
