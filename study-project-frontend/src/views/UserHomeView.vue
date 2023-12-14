<template>
    <div class="profile">
      <el-card class="profile-card">
        <div slot="header" class="profile-header">
          <el-avatar :src="avatar" size="large"></el-avatar>
          <div class="profile-name">{{ name }}</div>
        </div>
        <div class="profile-body">
          <el-tabs v-model="activeTab">
            <el-tab-pane label="个人资料">
              <el-form :model="formData" :rules="rules" ref="form" label-width="100px">
                <el-form-item label="用户名" prop="username">
                  <el-input v-model="formData.username" disabled></el-input>
                </el-form-item>
                <el-form-item label="英文名" prop="username-US">
                  <el-input v-model="formData.usernameUS" disabled></el-input>
                </el-form-item>
                <el-form-item label="邮箱" prop="email">
                  <el-input v-model="formData.email"></el-input>
                </el-form-item>
                <el-form-item label="IP地址" prop="urlip">
                  <el-input v-model="formData.urlip"></el-input>
                </el-form-item>
                <el-form-item>
                  <el-button type="primary" @click="submitForm('form')">保存</el-button>
                </el-form-item>
              </el-form>
            </el-tab-pane>
            <el-tab-pane label="所属公司">
              <el-table :data="videoList" style="width: 100%">
                <el-table-column prop="name" label="视频名称"></el-table-column>
                <el-table-column prop="size" label="视频大小"></el-table-column>
                <el-table-column prop="date" label="上传日期"></el-table-column>
              </el-table>
            </el-tab-pane>
            <el-tab-pane label="租房费用">
              <el-form :model="passwordForm" :rules="passwordRules" ref="passwordForm" label-width="100px">
                <el-form-item label="旧密码" prop="oldPassword">
                  <el-input type="password" v-model="passwordForm.oldPassword"></el-input>
                </el-form-item>
                <el-form-item label="新密码" prop="newPassword">
                  <el-input type="password" v-model="passwordForm.newPassword"></el-input>
                </el-form-item>
                <el-form-item label="确认密码" prop="confirmPassword">
                  <el-input type="password" v-model="passwordForm.confirmPassword"></el-input>
                </el-form-item>
                <el-form-item>
                  <el-button type="primary" @click="submitForm('passwordForm')">保存</el-button>
                </el-form-item>
              </el-form>
            </el-tab-pane>
            <el-button @click="test1()">等等</el-button>
          </el-tabs>
        </div>
      </el-card>
    </div>
  </template>
  
  <script>
import { createDOMCompilerError } from '@vue/compiler-dom';
import { reactive } from 'vue'
 
// created() ;{
//   const txt = 'function create';
//   console.log(txt);
// } 

  const dataList = reactive({
    username:'张三',
    usernameUS:'zhangsan',
    urlip:''
  })
  const test1 = () => {
    console.log("mmm");
  }
  
  export default {
    data() {
      return {
        activeTab: '1',
        formData: {
          username: 'admin',
          usernameUS: 'admin',
          email: 'admin@example.com',
          urlip: '1234567890'
        },
        rules: {
          email: [
            { required: true, message: '请输入邮箱', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }
          ],
          urlip: [
            { required: true, message: '请输入手机号', trigger: 'blur' },
            { pattern: /^1[3456789]\d{9}$/, message: '请输入正确的手机号', trigger: ['blur', 'change'] }
          ]
        },
        passwordForm: {
          oldPassword: '',
          newPassword: '',
          confirmPassword: ''
        },
        passwordRules: {
          oldPassword: [
            { required: true, message: '请输入旧密码', trigger: 'blur' }
          ],
          newPassword: [
            { required: true, message: '请输入新密码', trigger: 'blur' },
            { min: 6, max: 20, message: '密码长度在6到20个字符之间', trigger: 'blur' }
          ],
          confirmPassword: [
            { required: true, message: '请确认密码', trigger: 'blur' },
            { validator: this.validateConfirmPassword, trigger: 'blur' }
          ]
        },
        videoList: [
          { name: '视频1', size: '100MB', date: '2021-10-01' },
          { name: '视频2', size: '200MB', date: '2021-10-02' },
          { name: '视频3', size: '300MB', date: '2021-10-03' }
        ],
        avatar: 'https://avatars.githubusercontent.com/u/125264?s=200&v=4',
        name: 'admin'
      }
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate(valid => {
          if (valid) {
            this.$message.success('保存成功')
          }
        })
      },
      validateConfirmPassword(rule, value, callback) {
        if (value !== this.passwordForm.newPassword) {
          callback(new Error('两次输入的密码不一致'))
        } else {
          callback()
        }
      }
    }
  }

  </script>
  
  <style scoped>
  .profile {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100%;
  }
  
  .profile-card {
    height: 100%;
    width: 100%;
  }
  
  .profile-header {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-bottom: 20px;
  }
  
  .profile-name {
    font-size: 24px;
    margin-left: 20px;
  }
  
  .profile-body {
    padding: 20px;
  }
  </style>