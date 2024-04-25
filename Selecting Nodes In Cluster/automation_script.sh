kubectl create ns my-space
kubectl apply -f nodeAffinity.yaml
kubectl apply -f nodeSelector.yaml
kubectl apply -f nodeAntiAffinity.yaml
kubectl describe pods -n my-space | grep sample
