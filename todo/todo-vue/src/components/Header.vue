<script>
export default {
    data() {
        return  {
            text: ""
        }
    },
    methods: {
        handleTodo({ keyCode}) {
            const {text} = this
            // console.log({text} )
            // 추가
            if(keyCode === 13 && text != "") {
                this.$emit("insertTodo", text)
                this.text = ""
            }
        }
    }
}
</script>
<template>
    <header class="header">
        <h1>Todos</h1>
        <input type="text" v-model="text" placeholder="to do something" @keypress="handleTodo">
    </header>
</template>