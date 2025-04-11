<script>
export default {
    props: {
        todos: Array
    },
    methods: {
        // 삭제
        handleRemove(id) {
            this.$emit("removeTodo", id)
        },
        // 체크
        handleDone(id) {
            this.$emit("updateDone", id)
        }
    }
}
</script>
<template>
    <section class="main">
        <ul class="todo-list">
            <li v-for="({ id, text, done }, idx) in todos" :key="idx" :class="{ completed: done }">
                <div class="view">
                    <input type="checkbox" class="toggle" :checked="done" @click="handleDone(id)" />
                    <label>{{ text }}</label>
                    <button class="destory" @click="handleRemove(id)"></button>
                </div>
            </li>
        </ul>
    </section>
</template>
<style scoped>
.todo-list {
    margin: 0;
    padding: 0;
    list-style: none;
}

.todo-list li {
    position: relative;
    font-size: 24px;
    border-bottom: 1px solid gray;
}

.todo-list li .toggle {
    text-align: center;
    width: 40px;
    height: auto;
    position: absolute;
    top: 0;
    bottom: 0;
    margin: auto 0;
    border: none;
}

.todo-list li label {
    word-break: break-all;
    padding: 15px 15px 15px 60px;
    display: block;
}

.todo-list li.completed label {
    color: #d9d9d9;
    text-decoration: line-through;
}

.todo-list li .destory {
    display: none;
    position: absolute;
    top: 0;
    right: 10px;
    bottom: 0;
    width: 40px;
    height: 40px;
    margin: auto 0;
    font-size: 30px;
    color: #cc9a9a;
    margin-bottom: 11px;
}

.todo-list li .destory::after {
    content: "x";
}

.todo-list li:hover .destory {
    display: block;
}

.todo-list li .destory:hover {
    color: #a05355;
}
</style>