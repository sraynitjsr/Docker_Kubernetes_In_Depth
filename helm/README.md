## What is Helm?

#### Helm is a package manager for Kubernetes, a popular open-source container orchestration platform. It simplifies the process of defining, installing, and managing applications and services in Kubernetes clusters.

#### Helm allows us to define, package, and distribute Kubernetes applications as "charts," which are collections of pre-configured Kubernetes resources (such as deployments, services, and config maps) that can be easily deployed in a consistent and repeatable manner.

###### "helm create myapp" creates below repo structure
myapp/
  ├── charts/
  ├── templates/
  │   ├── NOTES.txt
  │   ├── _helpers.tpl
  │   ├── deployment.yaml
  │   ├── hpa.yaml
  │   ├── ingress.yaml
  │   ├── service.yaml
  ├── values.yaml
  ├── Chart.yaml
  └── README.md
