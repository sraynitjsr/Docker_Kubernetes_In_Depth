#!/bin/bash

NAMESPACE="my-namespace"

kubectl taint nodes worker3 avoid=true:NoSchedule

kubectl apply -f statefulset-no-toleration.yaml
kubectl apply -f statefulset-with-toleration.yaml
