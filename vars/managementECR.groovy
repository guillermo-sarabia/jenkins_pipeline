#!/usr/bin/env groovy

def clearCredentials(){
  echo 'Pull dependencies from repository'
  sh 'rm  ~/.dockercfg || true'
  sh 'rm ~/.docker/config.json || true'
}
