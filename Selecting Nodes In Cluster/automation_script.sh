kubectl create ns my-space
kubectl apply -f Deployment1.yaml
kubectl apply -f Deployment2.yaml
kubectl describe pods -n my-space | grep sample
