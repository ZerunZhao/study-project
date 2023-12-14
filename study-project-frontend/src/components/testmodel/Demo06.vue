<template>
<p>数组变化侦测</p>
<!-- 用以下方法处理数据的时候，数组数据变化，UI也随之变化 
    push()、数组最后添加元素，并返回数组长度
    pop()、删除并返回数据的最后一个元素
    shift()、删除并返回数组第一个元素
    unshift()、数组最前添加元素，并返回数组长度
    splice(2)、保留前2个元素
    sort()、默认排序//类似compare 各元素逐位比较，升序。
    reverse()、数组反转-->

<!-- 不会引起UI自动更新，不改变原数组，而是返回一个新的数组 
    concat、数据拼接
    filter、
    slice、

-->
    <p @click="testFunction">DemoTest</p>
    <p>{{ arr1 }}</p>
    <button @click="testFunction2">button</button>
</template>

<script>
export default{
    data(){
        return{
        arr1:[1,2,3,1,5,6],
        arr2:[11,22,33,14,55,66],
        result:[]
        }
    },
    methods:{
        testFunction(){
            const i = this.arr1.slice(1,3); 
            console.log(i)
        },
        testFunction2(){
            console.log(this.arr1)
        }
    }
}
</script>