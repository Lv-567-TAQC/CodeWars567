package com.ss.ita.util;

public enum UserName{
    NNN7(1L, "Nnn7", "Iaroslav Tereshko"),
    ANDRIIKAPUSTIAK(2L, "andriikapustiak", "Andrii Kapustiak"),
    KHRYSTIASH(3L, "khrystiash", "Khrystyna Shalavylo"),
    KUDERIAVETSNATA(4L, "kuderiavetsnata", "Kuderiavets Natalia"),
    NATALIAA0223(5L, "nataliia0223", "Nataliia Koval"),
    ROMANKHVALBOTA(6L, "romankhvalbota", "Roman Khvalbota"),
    VLADISLAVSHEVCHUK(7L, "vladislavshevchuk", "Shevchuk Vladislav");
    
    
    private final Long id;
    private final String gitHubNick;
    private final String fullName;
    
    UserName(Long id, String gitHubNick, String fullName) {
        this.id = id;
        this.gitHubNick = gitHubNick;
        this.fullName = fullName;
    }
    
    public String getGitHubNick() {
        return gitHubNick;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return fullName;
    }
    
    public static UserName getById(Long id) {
        for(UserName user: values()) {
            if(user.id.equals(id)) {
                return user;
            }
        }
        return null;
    }
}
