# Kubernetes Probes

Probes in Kubernetes are a mechanism for monitoring the health and readiness of an application running within a container.
They are essential for ensuring the reliability and availability of our applications in a kubernetes cluster.

## Types of Probes

Kubernetes supports three types of probes:

1. **Liveness Probe**: Determines if the container is running correctly. If the liveness probe fails, Kubernetes will restart the container.
   
2. **Readiness Probe**: Indicates if the container is ready to serve traffic. If the readiness probe fails, the container will be removed from the service's endpoints, and traffic will not be routed to it.

3. **Startup Probe**: Introduced in Kubernetes 1.16, it is used to determine when the application within the container has started. Unlike liveness and readiness probes, the startup probe only runs once during the startup of a container.

## Configuration

Probes are configured in the Pod specification under the `spec.containers` field. Each container within a Pod can have its own set of probes.

Here's an example of how to configure probes:

```yaml
apiVersion: v1
kind: Pod
metadata:
  name: mypod
spec:
  containers:
  - name: mycontainer
    image: myimage
    readinessProbe:
      httpGet:
        path: /ready
        port: 8080
      initialDelaySeconds: 5
      periodSeconds: 10
    livenessProbe:
      tcpSocket:
        port: 8080
      initialDelaySeconds: 15
      periodSeconds: 20
    startupProbe:
      exec:
        command: ["sh", "-c", "myapp --check-status"]
      failureThreshold: 30
      periodSeconds: 10
