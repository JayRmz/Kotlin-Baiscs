package dev.jayramirez.breakncontinue

fun main(){

    //Break -> It stops the loop
    print("\nBreak:")
    for(i in 1 until 20) {
        print("$i, ")
        if(i/2 == 5){
            break
        }
    }

    //Continue -> skips current iteration
    print("\nContinue:")
    for(i in 1 until 20) {
        print("$i, ")
        if(i/2 == 5){
            continue
        }
    }
}