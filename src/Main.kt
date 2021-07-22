fun main() {
    println(sortByHeight(mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)))
}


fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    for(i in 0.rangeTo(a.size-1)){
        if(a[i]==-1)
            continue
        for(j in 0.rangeTo(a.size-1)){
            if(a[j]==-1)
                continue
            if(a[i]<a[j]){
                var temb=a[i]
                a[i]=a[j]
                a[j]=temb}}}
    return a
}
