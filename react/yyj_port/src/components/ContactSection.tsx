import React, { useState } from 'react';
import { Mail, Check, Copy, Send, Github, Linkedin, MessageSquare, ArrowUpRight } from 'lucide-react';

interface ContactSectionProps {
  isOpenModal?: boolean;
  onCloseModal?: () => void;
}

export const ContactSection: React.FC<ContactSectionProps> = ({ isOpenModal, onCloseModal }) => {
  const [copied, setCopied] = useState(false);
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    topic: 'project',
    message: ''
  });
  const [isSubmitting, setIsSubmitting] = useState(false);
  const [submitted, setSubmitted] = useState(false);

  const emailText = 'brightyyj@gmail.com';

  const handleCopyEmail = () => {
    navigator.clipboard.writeText(emailText);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  const handleApplyTemplate = (type: 'project' | 'hire' | 'coffee') => {
    if (type === 'project') {
      setFormData({
        ...formData,
        topic: 'project',
        message: '안녕하세요 양영준 엔지니어님, 신규 웹 프로덕트 프론트엔드 구축 및 고성능 UI 개발과 관련하여 협업을 논의드리고 싶습니다.'
      });
    } else if (type === 'hire') {
      setFormData({
        ...formData,
        topic: 'hire',
        message: '안녕하세요, 저희 회사 시니어 프론트엔드 엔지니어 포지션과 관련하여 양영준 님의 경력과 역량에 큰 관심을 가지게 되어 연락드립니다.'
      });
    } else {
      setFormData({
        ...formData,
        topic: 'coffee',
        message: '안녕하세요, 블로그 글과 웹 성능 최적화 발표 자료를 감명 깊게 읽었습니다. 가벼운 온라인 커피챗으로 프론트엔드 아키텍처에 대해 이야기 나눌 수 있을까요?'
      });
    }
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (!formData.name || !formData.email || !formData.message) return;

    setIsSubmitting(true);
    setTimeout(() => {
      setIsSubmitting(false);
      setSubmitted(true);
      setTimeout(() => {
        setSubmitted(false);
        setFormData({ name: '', email: '', topic: 'project', message: '' });
        if (onCloseModal) onCloseModal();
      }, 2500);
    }, 800);
  };

  const content = (
    <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
      {/* Section Header */}
      <div className="pb-10 border-b border-white/[0.08]">
        <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
          05. Get In Touch & Inquiries
        </div>
        <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
          새로운 기회와 혁신적인 프로젝트를 환영합니다
        </h2>
        <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
          도전적인 프론트엔드 문제, 고성능 대시보드 구축, 또는 기술 커피챗에 언제나 열려 있습니다. 편하게 연락주세요.
        </p>
      </div>

      <div className="mt-12 grid grid-cols-1 lg:grid-cols-12 gap-12 items-start">
        {/* Left Column: Direct info & Quick copy */}
        <div className="lg:col-span-5 space-y-6">
          <div className="rounded-2xl border border-white/[0.08] bg-[#12141c] p-6">
            <h3 className="text-base font-semibold text-white">직접 이메일 연락</h3>
            <p className="mt-1 text-xs text-zinc-400">
              보통 24시간 이내에 회신드립니다.
            </p>

            <div className="mt-4 flex items-center justify-between rounded-xl bg-zinc-950 p-3 border border-white/[0.06]">
              <span className="font-mono text-sm text-zinc-200">{emailText}</span>
              <button
                onClick={handleCopyEmail}
                className="flex items-center gap-1 text-xs font-medium text-indigo-400 hover:text-indigo-300 transition-colors"
              >
                {copied ? (
                  <>
                    <Check className="h-3.5 w-3.5 text-emerald-400" />
                    <span className="text-emerald-400">복사됨</span>
                  </>
                ) : (
                  <>
                    <Copy className="h-3.5 w-3.5" />
                    <span>주소 복사</span>
                  </>
                )}
              </button>
            </div>
          </div>

          {/* Social Links - Clean typography, no pills */}
          <div className="rounded-2xl border border-white/[0.08] bg-[#12141c] p-6">
            <h3 className="text-base font-semibold text-white">온라인 채널 & 깃허브</h3>
            <div className="mt-4 space-y-3">
              <a
                href="https://github.com"
                target="_blank"
                rel="noreferrer"
                className="flex items-center justify-between py-2 text-xs text-zinc-300 hover:text-white transition-colors border-b border-white/[0.04]"
              >
                <div className="flex items-center gap-2">
                  <Github className="h-4 w-4 text-zinc-400" />
                  <span>GitHub (@brightyyj)</span>
                </div>
                <ArrowUpRight className="h-3.5 w-3.5 text-zinc-400" />
              </a>

              <a
                href="https://linkedin.com"
                target="_blank"
                rel="noreferrer"
                className="flex items-center justify-between py-2 text-xs text-zinc-300 hover:text-white transition-colors border-b border-white/[0.04]"
              >
                <div className="flex items-center gap-2">
                  <Linkedin className="h-4 w-4 text-zinc-400" />
                  <span>LinkedIn (/in/yeongjun-yang)</span>
                </div>
                <ArrowUpRight className="h-3.5 w-3.5 text-zinc-400" />
              </a>

              <a
                href="https://velog.io"
                target="_blank"
                rel="noreferrer"
                className="flex items-center justify-between py-2 text-xs text-zinc-300 hover:text-white transition-colors"
              >
                <div className="flex items-center gap-2">
                  <MessageSquare className="h-4 w-4 text-zinc-400" />
                  <span>Tech Blog (기술 블로그 & 아티클)</span>
                </div>
                <ArrowUpRight className="h-3.5 w-3.5 text-zinc-400" />
              </a>
            </div>
          </div>
        </div>

        {/* Right Column: Functional Message Form */}
        <div className="lg:col-span-7 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6 sm:p-8">
          <div className="flex items-center justify-between border-b border-white/[0.08] pb-4 mb-6">
            <h3 className="text-base font-semibold text-white">빠른 문의 폼</h3>
            
            {/* Template quick fill buttons */}
            <div className="flex items-center gap-1 text-[11px] font-mono text-zinc-400">
              <span className="hidden sm:inline">템플릿:</span>
              <button
                type="button"
                onClick={() => handleApplyTemplate('project')}
                className="px-2 py-0.5 rounded hover:bg-white/[0.06] text-zinc-300 transition-colors"
              >
                프로젝트
              </button>
              <span>·</span>
              <button
                type="button"
                onClick={() => handleApplyTemplate('hire')}
                className="px-2 py-0.5 rounded hover:bg-white/[0.06] text-zinc-300 transition-colors"
              >
                채용
              </button>
              <span>·</span>
              <button
                type="button"
                onClick={() => handleApplyTemplate('coffee')}
                className="px-2 py-0.5 rounded hover:bg-white/[0.06] text-zinc-300 transition-colors"
              >
                커피챗
              </button>
            </div>
          </div>

          {submitted ? (
            <div className="py-12 text-center animate-in fade-in duration-300">
              <div className="inline-flex h-12 w-12 items-center justify-center rounded-full bg-emerald-500/10 text-emerald-400 mb-4">
                <Check className="h-6 w-6" />
              </div>
              <h4 className="text-lg font-bold text-white">문의가 성공적으로 전달되었습니다!</h4>
              <p className="mt-1 text-xs text-zinc-400">
                작성해주신 이메일({formData.email || '입력하신 주소'})로 곧 연락드리겠습니다.
              </p>
            </div>
          ) : (
            <form onSubmit={handleSubmit} className="space-y-4">
              <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
                <div>
                  <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                    이름 <span className="text-rose-400">*</span>
                  </label>
                  <input
                    type="text"
                    required
                    value={formData.name}
                    onChange={(e) => setFormData({ ...formData, name: e.target.value })}
                    placeholder="홍길동"
                    className="w-full rounded-lg border border-white/10 bg-zinc-950 px-3.5 py-2.5 text-xs text-white placeholder-zinc-500 focus:outline-none focus:ring-1 focus:ring-indigo-500"
                  />
                </div>

                <div>
                  <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                    회신받을 이메일 <span className="text-rose-400">*</span>
                  </label>
                  <input
                    type="email"
                    required
                    value={formData.email}
                    onChange={(e) => setFormData({ ...formData, email: e.target.value })}
                    placeholder="example@company.com"
                    className="w-full rounded-lg border border-white/10 bg-zinc-950 px-3.5 py-2.5 text-xs text-white placeholder-zinc-500 focus:outline-none focus:ring-1 focus:ring-indigo-500"
                  />
                </div>
              </div>

              <div>
                <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                  문의 목적
                </label>
                <select
                  value={formData.topic}
                  onChange={(e) => setFormData({ ...formData, topic: e.target.value })}
                  className="w-full rounded-lg border border-white/10 bg-zinc-950 px-3 py-2 text-xs text-white focus:outline-none focus:ring-1 focus:ring-indigo-500"
                >
                  <option value="project">신규 프로젝트 의뢰 / 외주 컨설팅</option>
                  <option value="hire">시니어 프론트엔드 포지션 채용 제안</option>
                  <option value="coffee">온라인 기술 커피챗 & 멘토링</option>
                  <option value="other">기타 문의</option>
                </select>
              </div>

              <div>
                <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                  메시지 내용 <span className="text-rose-400">*</span>
                </label>
                <textarea
                  required
                  rows={4}
                  value={formData.message}
                  onChange={(e) => setFormData({ ...formData, message: e.target.value })}
                  placeholder="구체적인 프로젝트 일정, 요구사항 또는 제안 내용을 편하게 작성해 주세요."
                  className="w-full rounded-lg border border-white/10 bg-zinc-950 px-3.5 py-2.5 text-xs text-white placeholder-zinc-500 focus:outline-none focus:ring-1 focus:ring-indigo-500 resize-none leading-relaxed"
                />
              </div>

              <button
                type="submit"
                disabled={isSubmitting}
                className="w-full inline-flex items-center justify-center gap-2 rounded-lg bg-indigo-600 px-5 py-2.5 text-xs font-semibold text-white transition-all hover:bg-indigo-500 active:scale-[0.98] disabled:opacity-50"
              >
                {isSubmitting ? (
                  <span>전송 중...</span>
                ) : (
                  <>
                    <Send className="h-3.5 w-3.5" />
                    <span>메시지 보내기</span>
                  </>
                )}
              </button>
            </form>
          )}

        </div>
      </div>
    </div>
  );

  if (isOpenModal) {
    return (
      <div
        role="dialog"
        aria-modal="true"
        className="fixed inset-0 z-50 flex items-center justify-center p-4 sm:p-6 bg-black/80 backdrop-blur-sm animate-in fade-in duration-200"
      >
        <div
          className="relative max-h-[90vh] w-full max-w-4xl overflow-y-auto rounded-2xl border border-white/10 bg-[#0e1017] p-6 shadow-2xl text-zinc-100"
          onClick={(e) => e.stopPropagation()}
        >
          <div className="flex justify-end pb-2">
            <button
              onClick={onCloseModal}
              className="rounded-lg p-1.5 text-zinc-400 hover:bg-white/[0.06] hover:text-white transition-colors"
            >
              닫기
            </button>
          </div>
          {content}
        </div>
      </div>
    );
  }

  return (
    <section id="contact" className="py-20 md:py-28 border-b border-white/[0.06]">
      {content}
    </section>
  );
};
