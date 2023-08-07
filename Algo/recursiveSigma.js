function recursiveSigma(n){
   if (n===1){
        return 0;
    }
    else{

        return n+recursiveSigma(n-1);
    }
}
console.log(recursiveSigma(5));