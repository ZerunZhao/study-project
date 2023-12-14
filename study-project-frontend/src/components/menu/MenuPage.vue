<style>
/* html,body,#app,
.el-container {
    height: 100%;
} */
.el-menu{
    height:100vh;
}

</style>

<template>
    <div class="common-layout">
        <el-container>
            <el-aside width="200px">
                <el-menu router-view active-text-color="#ffd04b" background-color="#545c64" class="el-menu-vertical-demo"
                    default-active="2" text-color="#fff">
                    <el-sub-menu index="1">
                        <template #title>
                            <el-icon>
                                <location />
                            </el-icon>
                            <span>个人基本信息</span>
                        </template>
                        <el-menu-item-group>
                            <el-menu-item >
                                <router-link to="userHome">基本信息</router-link> 
                            </el-menu-item>
                            <el-menu-item index="1-2">
                                <RouterLink to="resumeAxis"> 简历轴</RouterLink>
                            </el-menu-item>
                            <el-menu-item index="1-3">
                                <RouterLink to="testModel"> 健康指数</RouterLink>
                            </el-menu-item>
                        </el-menu-item-group>
                    </el-sub-menu>

                    <el-sub-menu index="2">
                        <template #title>
                            <el-icon>
                                <location />
                            </el-icon>
                            <span>爬升之路</span>
                        </template>
                        <el-menu-item-group>
                            <el-menu-item index="2-1">面试文档</el-menu-item>
                            <el-menu-item index="2-2">视频导航</el-menu-item>
                        </el-menu-item-group>
                    </el-sub-menu>

                    <el-sub-menu index="3">
                        <template #title>
                            <el-icon>
                                <location />
                            </el-icon>
                            <span>生活</span>
                        </template>
                        <el-menu-item-group>
                            <el-menu-item index="3-1">生活吐槽</el-menu-item>
                        </el-menu-item-group>
                    </el-sub-menu>

                    <el-sub-menu index="4">
                        <template #title>
                            <el-icon>
                                <location />
                            </el-icon>
                            <span>经济</span>
                        </template>
                        <el-menu-item-group index="4-1">
                            <el-menu-item index="4-1-1">经济目标</el-menu-item>
                            <el-menu-item index="4-1-2">现实收入</el-menu-item>
                            <el-menu-item index="4-1-3">计划转折点</el-menu-item>
                        </el-menu-item-group>
                        <el-menu-item-group index="4-2">
                            <template #title>职场生涯</template>
                            <el-menu-item index="4-2-1">No1</el-menu-item>
                            <el-menu-item index="4-2-2">No2</el-menu-item>
                            <el-menu-item index="4-2-3">No3</el-menu-item>
                        </el-menu-item-group>
                    </el-sub-menu>
                </el-menu>
            </el-aside>
            <el-container>
                <el-header><el-button @click="logout()" type="danger" plain>退出登录</el-button></el-header>
                <el-main>
                    <router-view v-slot="{views}">

                    </router-view>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script setup>
import { get } from "@/net";
import { ElMessage } from "element-plus";
import router from "@/router";
import { useStore } from "@/stores";
import { RouterView } from "vue-router";

const store = useStore()

const logout = () => {
    get('/api/auth/logout', (message) => {
        ElMessage.success(message)
        store.auth.user = null
        router.push('/')
    })
}
</script>