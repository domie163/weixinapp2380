const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm7fp64/",
            name: "ssm7fp64",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7fp64/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "畅阅读微信小程序"
        } 
    }
}
export default base
