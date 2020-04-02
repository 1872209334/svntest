<template>
    <div style=" width:100%; height:100%; background-color: #F0F2F5; overflow:auto;">

        <div class="pageBox" style="overflow-y: auto">

            <div class="myNavigation">
                <el-breadcrumb separator="/" style="display: inline-block">
                    <el-breadcrumb-item>
                        <span style="font-size: 16px;color:#303313;">用户管理</span>
                    </el-breadcrumb-item>
                    <el-breadcrumb-item>
                        <span style="font-size: 14px;color:#606266;">管理员</span>
                    </el-breadcrumb-item>
                    <el-breadcrumb-item>
                        <span v-show="routeParam.type == 0" style="font-size: 14px;color:#606266;">新增保洁员</span>
                        <span v-show="routeParam.type != 0"style="font-size: 14px;color:#606266;">编辑保洁员</span>
                    </el-breadcrumb-item>
                </el-breadcrumb>
            </div>

            <div style="width:95%; height:80%; margin-left: 15px; margin-top:1%;">

                <table style="font-size: 14px;">
                    <tr>
                        <td>
                            姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            名</td>
                        <td>：</td>
                        <td>
                            <div style="width:240px;">
                                <el-input v-model="routeParam.account" placeholder="请输入姓名"></el-input>
                            </div>
                        </td>
                    </tr>

                    <!--<tr v-show="routeParam.type == 0">-->
                    <tr>
                        <td><br>
                            年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            龄</td>
                        <td><br>：</td>
                        <td><br>
                            <div style="width:240px;">
                                <el-input v-model="routeParam.passwordInput" placeholder="请输入年龄"></el-input>
                            </div>
                        </td>
                    </tr>
                    <!--<tr v-show="routeParam.type == 0">-->
                    <tr>
                        <td><br>
                            性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            别</td>
                        <td><br>：</td>
                        <td><br>
                            <div style="width:240px;">
                                <el-input v-model="routeParam.sexInput" placeholder="请输入性别(男/女)"></el-input>
                            </div>
                        </td>
                    </tr>
                    <!--<tr>-->
                        <!--<td><br>-->
                            <!--性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                            <!--别</td>-->
                        <!--<td><br>：</td>-->
                        <!--<td><br>-->
                            <!--<div style="width:240px;">-->
                                <!--<el-select v-model="routeParam.roleId" placeholder="请选择性别" @change="clickRole">-->
                                    <!--<el-option v-for="item in sex" :key="item.roleId" :label="item.roleName" :value="item.roleId">-->
                                    <!--&lt;!&ndash;<el-option v-for="item in roleList" :key="item.roleId" :label="item.roleName" :value="item.roleId">&ndash;&gt;-->
                                    <!--</el-option>-->
                                <!--</el-select>-->
                            <!--</div>-->
                        <!--</td>-->
                    <!--</tr>-->
                    <tr>
                        <td style="letter-spacing: 0.2px;"><br>
                            区&nbsp;&nbsp;域&nbsp;&nbsp;选&nbsp;&nbsp;择</td>
                        <td><br>：</td>
                        <td><br>
                            <div style="width:240px; float: left;">
                                <!--省级下拉框-->
                                <el-select v-model="routeParam.provinceId" placeholder="省" @change="clickProvince">
                                    <el-option v-show="userInfo.roleType == 0" label="不限" :value="0">
                                    </el-option>
                                    <el-option v-show="routeParam.roleId != 1" v-for="item in province" :key="item.provinceId" :label="item.provinceName" :value="item.provinceId">
                                    </el-option>
                                </el-select>
                            </div>
<!--                            <div style="width:240px; float: left; margin-left: 10px;">-->
<!--                                <el-select v-model="routeParam.areaId" placeholder="市" @change="clickCity">-->
<!--                                    <el-option v-show="userInfo.roleType != 2" label="不限" :value="0" >-->
<!--                                    </el-option>-->
<!--                                    <el-option v-show="routeParam.roleId == 25" v-for="item in city" :key="item.areaId" :label="item.areaName" :value="item.areaId">-->
<!--                                    </el-option>-->
<!--                                </el-select>-->
<!--                            </div>-->
                        </td>
                        <td><br>

                        </td>
                    </tr>

                    <tr>
                        <td><br>
                            手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            机</td>
                        <td><br>：</td>
                        <td><br>
                            <div style="width:240px;">
                                <el-input v-model="routeParam.mobile" placeholder="请输入手机号" type="number" onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))"></el-input>
                            </div>
                        </td>
                    </tr>
                    <tr v-if="routeParam.provinceId == 0 && routeParam.areaId == 0">
                        <td><br>
                            站&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            点</td>
                        <td><br>：</td>
                        <td colspan="2"><br>
                            <div style="width: 480px;height:80px;overflow: auto;line-height: 80px;text-indent: 10px">
                               <span>拥有全部站点权限</span>
                            </div>
                        </td>
                    </tr>
                    <tr  v-if="routeParam.provinceId != 0 || routeParam.areaId != 0">
                        <td><br>
                            站&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            点</td>
                        <td><br>：</td>
                        <td colspan="2"><br>
                            <div style="width: 480px;height:80px;overflow: auto; ">
                                <el-checkbox-group v-model="projectCheckList">
                                <div style="float:left; margin-right: 20px; height:33%" v-for="item in projectList">
                                    <el-checkbox v-if="routeParam.type == 1" :value="item.siteCord" :label="item.siteCord" :checked="routeParam.bid.split(',').indexOf(item.siteCord) > -1">
                                        {{item.siteLabel}}
                                    </el-checkbox>
                                    <el-checkbox v-if="routeParam.type == 0" :value="item.siteCord" :label="item.siteCord">
                                        {{item.siteLabel}}
                                    </el-checkbox>
                                </div>
                                </el-checkbox-group>
                                <span v-if="projectList.length == 0" style="position: relative;top: 30px;">该地区暂无站点</span>
                            </div>

                        </td>
                    </tr>



                    <tr>
                        <td><br>
                            备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            注</td>
                        <td><br>：</td>
                        <td colspan="2"><br>
                            <div style="width:560px;">
                                <el-input
                                    class="myTextArea"
                                    type="textarea"
                                    :rows="3"
                                    placeholder="请输入备注信息..."
                                    v-model="routeParam.remark">
                                </el-input>
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td></td><td></td>
                        <td><br>
                            <div style="float: left; height:40px; width:56px">
                                <el-button class="v-1-0-0-Button" @click="saveAdmin">保存</el-button>
                            </div>
                            <div style="float: left; height:40px;width:56px; margin-left: 16px;">
                                <!--<router-link to="/manage">-->
                                <router-link to="/controlPersonnel">
                                    <el-button class="v-1-0-0-Button-Minor">返回</el-button>
                                </router-link>
                            </div>
                        </td>
                    </tr>
                </table>

            </div>


        </div>

    </div>
</template>

<script>
    import http from '../../../common/http';
    import bus from '../../../common/bus';
    export default {
        data() {
            return {
                routeParam:{},
                projectCheckList:[],
                passwordInput:"",
                sexInput:"",
                provinceValue:0,
                cityValue:0,
                province:[],
                city:[],
                projectList:[],
                roleList:"",
                // sex:["男","女"],
                roleValue:"",
                bidList:[],
            };
        },
        created:function(){
            //获取省列表
            this.getProvince();
            console.log(this.$route);
            this.routeParam = this.$route.params;
            this.userInfo = JSON.parse(sessionStorage.getItem('user_info'));
            console.log(this.routeParam)
        },
        methods: {
            getProvince(){
                let _loading = this.$commonFn.showLoading(2,'.main-box');
                let data = {
                    roleId:this.$route.params.roleId
                };
                let url = this.getProvinceAndRoleUrl;
                this.apiPost(url, data).then((res) => {
                    _loading.close();
                    this.province = res.data.prinvince;
                    this.roleList = res.data.role;
                    //编辑页面触发更新省和地区
                    if(this.routeParam.type != 0){
                        this.updateArea();
                    }
                }, (err) => {
                    _loading.close();
                });
            },
            //保存管理员
            saveAdmin(){
                console.log(this.routeParam.provinceId)
                console.log(this.routeParam.areaId)
                if(this.routeParam.account == "" || this.routeParam.account == undefined){
                    this.$commonFn.showTip("姓名不能为空",2);
                    return false;
                }
                if(this.routeParam.type == 0){
                    if(this.routeParam.passwordInput == "" || this.routeParam.passwordInput == undefined || this.routeParam.passwordInput.length >= 3){
                        this.$commonFn.showTip("请正确输入年龄",2);
                        return false;
                    }
                }
                if(this.routeParam.sexInput != "男" && this.routeParam.sexInput != "女"){
                    this.$commonFn.showTip("请正确输入性别",2);
                    return false;
                }

                if(this.routeParam.provinceId === "" || this.routeParam.areaId === ""){
                    this.$commonFn.showTip("请选择管理员区域",2);
                    return false;
                }
                if(this.routeParam.provinceId === "" || this.routeParam.provinceId == null){
                    this.$commonFn.showTip("请选择管理员区域",2);
                    return false;
                }
                if(this.routeParam.areaId === "" || this.routeParam.areaId == null){
                    this.$commonFn.showTip("请选择管理员区域",2);
                    return false;
                }
                let valid_mobile = /^1[3|4|5|7|8|9][0-9]\d{8}$/;
                if(!valid_mobile.test(this.routeParam.mobile)){
                    this.$commonFn.showTip("请正确填写手机格式",2);
                    return false;
                }
                // if(this.routeParam.roleId == "" || this.routeParam.roleId == undefined){
                //     this.$commonFn.showTip("请选择管理员权限",2);
                //     return false;
                // }
                let bid;
                if(this.routeParam.provinceId == 0 && this.routeParam.areaId == 0){
                    bid = 0;
                }
                else{
                    bid = this.projectCheckList.join(",");
                }
                //添加管理员
                if(this.routeParam.type == 0){
                    if(this.routeParam.passwordInput == ""){
                        this.$commonFn.showTip("年龄不能为空",2);
                        return false;
                    }
                    let _loading = this.$commonFn.showLoading(2,'.main-box');
                    let url = this.saveCleanUserUrl;
                    let data = {
                        unid:this.routeParam.unid == null?0:this.routeParam.unid,
                        uname:this.routeParam.account,
                        uage:this.routeParam.passwordInput,
                        // password2:this.passwordInput,
                        usex:this.routeParam.sexInput,
                        uphone:this.routeParam.mobile,
                        provinceId : this.routeParam.provinceId,
                        areaId: this.routeParam.areaId,
                        umessage : this.routeParam.remark == null?"":this.routeParam.remark,
                        bid:bid,
                        // fireRole: this.routeParam.roleId,
                        // remark : this.routeParam.remark == null?"":this.routeParam.remark,
                        // provinceId : this.routeParam.provinceId,
                        // areaId: this.routeParam.areaId,
                    };
                    console.log(data);
                    this.apiPost(url, data).then((res) => {
                        _loading.close();
                        if(res.status === 200){
                            this.$commonFn.showTip("添加成功",1);
                            // this.$router.push('/manage');
                            this.$router.push('/controlPersonnel');
                        }else{
                            this.$commonFn.showTip(res.message,3);
                        }
                    }, (err) => {
                        _loading.close();
                        console.log(err);
                    });
                }
                //编辑管理员
                else{
                    let _loading = this.$commonFn.showLoading(2,'.main-box');
                    // let url = this.saveAdminUrl;
                    let url = this.updateCleanAdminUrl;
                    let data = {
                        unid:this.routeParam.unid == null?0:this.routeParam.unid,
                        uname:this.routeParam.account,
                        uage:this.routeParam.passwordInput,
                        usex:this.routeParam.sexInput,
                        uphone:this.routeParam.mobile,
                        provinceId : this.routeParam.provinceId,
                        areaId: this.routeParam.areaId,
                        umessage : this.routeParam.remark == null?"":this.routeParam.remark,
                        bid:bid,
                    };
                    console.log(data);
                    this.apiPost(url, data).then((res) => {
                        _loading.close();
                        console.log(res);
                        if(res.status == 200){
                            this.$commonFn.showTip("修改成功",1);
                            this.$router.push('/controlPersonnel');
                        }else{
                            this.$commonFn.showTip(res.message,3);
                        }
                    }, (err) => {
                        _loading.close();
                        console.log(err);
                    });
                }
            },
            //触发更新地区
            updateArea(){
                let data = {
                    privinceId : this.routeParam.provinceId
                };
                let url = this.getCityAndSiteUrl;
                this.apiPost(url, data).then((res) => {
                    this.city = res.data.city;
                    let data = {
                        provinceId : this.routeParam.provinceId,
                        areaId: this.routeParam.areaId,
                    };
                    let url = this.getSiteByCity;
                    this.apiPost(url, data).then((res) => {
                        this.projectList = res.data.site;
                        for (let i in this.projectList){
                            if(this.projectList[i].siteName){
                                this.projectList[i].siteLabel = this.projectList[i].siteName;
                            }
                            else{
                                this.projectList[i].siteLabel = this.projectList[i].siteCord;
                            }
                        }
                    }, (err) => {

                    });
                }, (err) => {

                });

            },
            clickRole(){
                console.log("b");
                this.routeParam.provinceId = null;
                this.routeParam.areaId = null;
            },
            //点击省下拉框
            clickProvince(){
                if(this.routeParam.provinceId != 0){
                    //this.routeParam.roleId = null;
                    let data = {
                        privinceId : this.routeParam.provinceId
                    };
                    let url = this.getCityAndSiteUrl;
                    this.apiPost(url, data).then((res) => {
                        this.routeParam.areaId = 0;
                        this.city = res.data.city;
                        this.projectList = res.data.site;
                        for (let i in this.projectList){
                            if(this.projectList[i].siteName){
                                this.projectList[i].siteLabel = this.projectList[i].siteName;
                            }
                            else{
                                this.projectList[i].siteLabel = this.projectList[i].siteCord;
                            }
                        }
                    }, (err) => {

                    });
                }
                else{
                    this.routeParam.areaId = 0;
                    this.city = [];
                    this.routeParam.roleId = 1;
                }
            },

            //点击市下拉框
            clickCity(){
                let data = {
                    privinceId : this.routeParam.provinceId,
                    areaId: this.routeParam.areaId,
                };
                let url = this.getSiteByCity;
                this.apiPost(url, data).then((res) => {
                    this.projectList = res.data.site;
                    for (let i in this.projectList){
                        if(this.projectList[i].siteName){
                            this.projectList[i].siteLabel = this.projectList[i].siteName;
                        }
                        else{
                            this.projectList[i].siteLabel = this.projectList[i].siteCord;
                        }
                    }
                }, (err) => {

                });
            }
        },
        mixins: [http]
    };
</script>

<style scoped>

</style>


