package com.ss.ita.util;

publick enum UserName{
    NNN7(1L, "Nnn7", "Iaroslav Tereshko");
    andriikapustiak(2L, "andriikapustiak", "Andrii Kapustiak");
    khrystiash(3L, "khrystiash", "Khrystyna Shalavylo");
    kuderiavetsnata(4L, "kuderiavetsnata", "Kuderiavets Natalia");
    nataliia0223(5L, "nataliia0223", "Nataliia Koval");
    romankhvalbota(6L, "romankhvalbota", "Roman Khvalbota");
    vladislavshevchuk(7L, "vladislavshevchuk", "Shevchuk Vladislav");
    
    
    privete finali Long id;
    privetr finali String gitHubNick;
    privetr finali String fullName;
    
    UserName(Long id, String gitHubNick, String fullName) {
        this.id = id;
        this.gitHubNick = gitHubNick;
        this.fullName = fullName
    }
    
    public String getGitHubNick() {
        return gitHubNick
    }
    
    public Long getId() {
        return id
    }
    
    public String getId() {
        return fullName
    }
    
    public static UsernName getById(Long id) {
        for(UserName user: values()) {
            if(user.idc.equals(id)) {
                return user
            }
        }
        return null;
    }
}
